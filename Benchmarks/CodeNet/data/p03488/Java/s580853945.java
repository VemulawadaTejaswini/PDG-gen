import java.util.*;
public class Main{
  static boolean flag = false;
  static int x;
  static int y;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] c = sc.next().toCharArray();
    x = sc.nextInt();
    y = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    int cnt = 0;
    for(int i=0;i<c.length;i++){
      if(c[i]=='F')cnt++;
      else{
        list.add(cnt);
        cnt=0;
      }
    }
    list.add(cnt);
    dfs(0,0,0,0,list);
    if(flag)System.out.println("Yes");
    else System.out.println("No");
  }
  static void dfs(int dx,int dy,int di,int k,List<Integer> list){
    if(k==list.size())return;
    else if(di==0)dx+=list.get(k);
    else if(di==1)dy+=list.get(k);
    else if(di==2)dx-=list.get(k);
    else if(di==3)dy-=list.get(k);
    k++;
    if(k==list.size()&&x==dx&&dy==y)flag=true;
    dfs(dx,dy,(di+1)%4,k,list);
    dfs(dx,dy,(di-1)%4,k,list);
    return;
  }
}