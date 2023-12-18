import java.util.*;
public class Main {
    static String s;
    static int x,y;
    static int flag = 0;
    public static void wfs(int i,int nx, int ny, int p){
        if(i==s.length() && nx==x && ny==y){
            flag = 1;
            return;
        }
        if(i==s.length() || flag==1) return;
        if(s.charAt(i)=='F'){
            if(p==1){
                nx = nx +1;
                wfs(i+1,nx,ny,p);
            } else if(p==-1){
                nx = nx -1;
                wfs(i+1,nx,ny,p);
            } else if(p==2){
                ny+=1;
                wfs(i+1,nx,ny,p);
            } else if(p==-2){
                ny+=-1;
                wfs(i+1,nx,ny,p);
            }

        } else {
            if(p==1 || p==-1){
                p=2;
                wfs(i+1,nx,ny,p);
                p=-2;
                wfs(i+1,nx,ny,p);
            } else {
                p=1;
                wfs(i+1,nx,ny,p);
                p=-1;
                wfs(i+1,nx,ny,p);
            }
        }


    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        s =sc.next();
        x = sc.nextInt();
        y = sc.nextInt();
        int nx=0;
        int ny=0;
        int p=1;
        wfs(0,0,0,1);
        if(flag==1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
