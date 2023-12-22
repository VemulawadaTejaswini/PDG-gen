#include<iostream>
#include<cstdlib>
using namespace std;
#define REP(i,b,n) for(int i=b;i<n;i++)
#define rep(i,n)   REP(i,0,n)
const int N = 60;
int tc=1075;
enum st{BLOCK=0,ICE,GOAL,FIXED,HOLE,SPACE,THREE,TWO,ONE,PLAYER};
enum endSt{CLEAR,DEATHBYHOLE,DETHBYBLOCK,DETHBLWALkINGGALL,GAVEUP};
const string inputChar="#IGCB.321S";
const string resultString[5]={"Game Over : Cleared","Game Over : Death by Hole","Game Over : Death by Block","Game Over : Death by Walking Goal","Game Over : Gave Up"};
st m[N+1][N+2];//
endSt isend;

void output(int r,int c){
  return;
  cout <<"begin" << endl;
  for(int i=r-1;i >= 0;i--){
    for(int j=0;j < c;j++)cout << inputChar[m[i][j]];
    cout << endl;
  }
  cout <<"end " <<endl<<endl;
}

void move(int &y,int &x,int newx){
  if (m[y][newx] != SPACE || m[y-1][newx] == SPACE)return;
  int dx=x < newx?1:-1;
  for(int j=x+dx;j != newx;j+=dx)
    if (m[y-1][j] == SPACE)return;
  swap(m[y][x],m[y][newx]);
  x=newx;
  return;
}

void push(int c,int y,int x,int dx){
  int last=x;
  for(int i=x+dx;;i+=dx){
    if (i == c-1 || i == 0 || m[y][i] == SPACE){last=i-dx;break;}
    if (m[y][i] == FIXED)return;
  }
  for(int i=last;i != x;i-=dx){
    int nowx=i;
    const int nowy=y;
    while(true){
      if (nowx == 0 || nowx == c-1){
	m[nowy][nowx]=SPACE;
	break;
      }
      int nextx=nowx+dx;
      //move
      if (m[nowy][nextx] != SPACE)break;
      swap(m[nowy][nowx],m[nowy][nextx]);
      if (nextx == 0 || nextx == c-1){
	m[nowy][nextx]=SPACE;
	break;
      }else if (m[nowy][nextx] == ICE){
	if (m[nowy-1][nextx] == SPACE)break;
      }else if (m[nowy][nextx] != ICE){
	if (m[nowy-1][nextx] != ICE)break;
      }
      else break;
      nowx=nextx;
    }
    
  }
  //if (m[y][0] != SPACE)m[y][0]=SPACE;
  //if (m[y][c-1] != SPACE)m[y][c-1]=SPACE;
}

void pull(int c,int y,int &x,int dx){
  int bx=x+dx,nx=x-dx;
  if (nx == 0 || nx == c-1)return;//go out of the map
  if (m[y][nx] == SPACE && m[y][bx] != SPACE && m[y][bx] != FIXED){
    swap(m[y][nx],m[y][x]);
    swap(m[y][x],m[y][bx]);
    x=nx;
  }
}

void getdown(int r,int c,int &y,int &x,int dx){
  if (y != 1 && x+dx != c-1 && x+dx != 0 && m[y][x+dx] == SPACE && m[y-1][x+dx] == SPACE){
    swap(m[y][x],m[y-1][x+dx]);
    y-=1;
    x+=dx;
  }
}

void climb(int r,int c,int &y,int &x,int dx){
  if (y != r-1 && x+dx != c-1 && x+dx != 0 &&  m[y+1][x] == SPACE && m[y+1][x+dx] == SPACE &&
      m[y][x+dx] != SPACE){
    swap(m[y][x],m[y+1][x+dx]);
    y=y+1;
    x=x+dx;
  }
}

void countdown(int y,int x,int py,int px){
  if ((x != px || y != py)){
    if (m[py-1][px] == THREE)m[py-1][px]=TWO;
    else if (m[py-1][px] == TWO)m[py-1][px]=ONE;
    else if (m[py-1][px] == ONE)m[py-1][px]=SPACE;
  }
}

bool disapBlock(int r,int c){
  bool isact=false;
  REP(i,1,r)rep(j,c)
    if (m[i][j] != PLAYER && m[i][j] != SPACE && m[i-1][j] == HOLE){
      m[i][j]=SPACE;isact=true;
    }
  return isact;
}

bool fallPlayer(int &y,int x){
  bool isact=false;
  while(m[y-1][x] == SPACE)swap(m[y-1][x],m[y][x]),isact=true,y--;
  return isact;
}

bool fallBlock(int r,int c){
  bool isact=false;
  bool willFall[r][c];
  rep(i,r)rep(j,c)willFall[i][j]=false;
  REP(i,1,r)rep(j,c)
    if (m[i][j] != PLAYER && m[i][j] != SPACE && 
	(j == 1 ||   m[i-1][j-1] == SPACE || m[i-1][j-1] == PLAYER) && 
	(            m[i-1][j  ] == SPACE || m[i-1][j  ] == PLAYER) &&
	(j == c-2 || m[i-1][j+1] == SPACE || m[i-1][j+1] == PLAYER)){
      if (m[i-1][j] == PLAYER)m[i-1][j]=SPACE;
       swap(m[i][j],m[i-1][j]);
      isact=true;
    }
  return isact;
}

void endProcess(int r,int c,int &y,int &x,int py,int px){
  countdown(y,x,py,px);
  while(true){
    bool isact=false;
    isact|=disapBlock(r,c);
    isact|=fallPlayer(y,x);
    isact|=fallBlock(r,c);
    if (!isact)break;
  }
}

void checkEnd(int y,int x,int gy,int gx){
  if (m[y-1][x] == GOAL)isend=(endSt)0;
  else if( m[y-1][x] == HOLE)isend=(endSt)1;
  else if (m[y][x] != PLAYER)isend=(endSt)2;//need more consideration
  else if (m[gy][gx] != GOAL)isend=(endSt)3;
}

void solve(int r,int c,int y,int x,int gy,int gx){
  int q;
  cin>>q;
  for(int i=0;i<q;i++){
    string a,b;
    cin>>a>>b;
    if (tc == 1074)cout << a <<" " << b << endl;
    if (isend != GAVEUP)continue;
    int py=y,px=x;
    if (a == "MOVETO"){
      int pos=atoi(b.c_str());
      move(y,x,pos);
    }else if (a == "PUSH"){
      if (b == "RIGHT")push(c,y,x,+1);
      else if (b == "LEFT")push(c,y,x,-1);
    }else if (a == "PULL"){
      if (b == "RIGHT")pull(c,y,x,-1);
      else if (b == "LEFT")pull(c,y,x,+1);
    }else if (a == "GETDOWN"){
      if (b == "RIGHT")getdown(r,c,y,x,+1);
      else if (b == "LEFT")getdown(r,c,y,x,-1);
    }else if (a == "CLIMB"){
      if (b == "RIGHT")   climb(r,c,y,x,+1);
      else if (b == "LEFT")climb(r,c,y,x,-1);
    }
    
    checkEnd(y,x,gy,gx);
    endProcess(r,c,y,x,py,px);
    if (isend != GAVEUP)continue;

    checkEnd(y,x,gy,gx);
    //cout << a <<" " << b << endl;
    output(r,c);
  }


}

int main(){
  int r,c;

  
  while(cin>>r>>c){
    tc++;
    if (r == 0 && c == 0)break;
    rep(i,N)rep(j,N)m[i][j]=SPACE;
    isend=GAVEUP;
    int sy,sx,gy,gx;
    for(int i=r-1;i>=0;i--){
      string tmp;cin>>tmp;
      if (tc == 1074)cout << tmp << endl;
      for(int j=0;j < c;j++){
	for(int k=0;k < inputChar.size();k++)
	  if (tmp[j] == inputChar[k])m[i+1][j+1]=(st)k;
	if (m[i+1][j+1] == GOAL)gy=i+1,gx=j+1;
	else if (m[i+1][j+1] == PLAYER)sy=i+1,sx=j+1;
      }
    }
    r++;
    c+=2;
    for(int j=0;j < c;j++)m[0][j]=BLOCK;
    //m[1][0]=m[1][c-1]=BLOCK;
    for(int i=2;i < r;i++)m[i][0]=m[i][c-1]=SPACE;
    output(r,c);
    solve(r,c,sy,sx,gy,gx);
    output(r,c);
    cout << resultString[(int)isend] << endl;
  }
  return 0;
}