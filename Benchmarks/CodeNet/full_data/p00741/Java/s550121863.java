import java.util.*;
class Main{
    static int[][] c;
    static int w,h;
    static void check(int x,int y){
        c[x][y]=0;
        if(x>0){
            if(y>0){
                if(c[x-1][y-1]==1){
					check(x-1,y-1);
				}
            }
			if(y<h-1){
                if(c[x-1][y+1]==1){
					check(x-1,y+1);
					check(x-1,y+1);
				}
            }
			if(c[x-1][y]==1){
				check(x-1,y);
			}
        }
        if(x<w-1){
            if(y>0){
                if(c[x+1][y-1]==1){
					check(x+1,y-1);
				}
            }
			if(y<h-1){
                if(c[x+1][y+1]==1){
					check(x+1,y+1);
				}
            }
			if(c[x+1][y]==1){
				check(x+1,y);
			}
        }
        if(y>0){
			if(c[x][y-1]==1){
				check(x,y-1);
			}
		}
        if(y<h-1){
			if(c[x][y+1]==1){
				check(x,y+1);
			}
		}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
			h=sc.nextInt();
			w=sc.nextInt();
			if(h!=0||w!=0){
				c=new int[w][h];
				for(int i=0;i<w;i++){
					for(int j=0;j<h;j++){
						c[i][j]=sc.nextInt();
					}
				}
				int ans=0;
				for(int i=0;i<w;i++){
					for(int j=0;j<h;j++){
						if(c[i][j]==1){
							ans++;
							check(i,j);
						}
					}
				}
				System.out.println(ans);
			}
			else{
				break;
			}
        }
    }
}
