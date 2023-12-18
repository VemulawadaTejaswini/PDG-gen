import java.util.*;
public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int K=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int dis=Math.abs(X)+Math.abs(Y);
        int min=dis/K-1;
        if(min<0){
            min=0;
        }
        if(dis%2==1&&K%2==0){
            System.out.println(-1);
            return;
        }
        if(dis%K==0){
            System.out.println(dis/K);
        }else{
            if((dis-min*K)%2==0){
                System.out.println(min+2);
            }else{
                System.out.println(min+3);
            }
        }
        int nowX=0;
        int nowY=0;
        for(int i=0;i<min;i++){
            if(nowX>X){
                if(nowX-K>=X){
                    nowX-=K;
                }else{
                    if(nowY>Y){
                        nowY-=(K-(nowX-X));
                        nowX=X;
                    }else{
                        nowY+=(K-(nowX-X));
                        nowX=X;

                    }
                }
            }else{
                if(nowX+K<=X){
                    nowX+=K;
                }else{
                    if(nowY>Y){
                        nowY-=(K-(X-nowX));
                        nowX=X;
                    }else{
                        nowY+=(K-(X-nowX));
                        nowX=X;
                    }
                }
            }
            System.out.println(nowX+" "+nowY);
        }
        if((Math.abs(nowY-Y)+Math.abs(nowX-X))!=K&&(Math.abs(nowY-Y)+Math.abs(nowX-X))%2==1){
            if(nowY!=Y){
                if(nowY<Y){
                    nowY+=K;
                }else{
                    nowY-=K;
                }
            }else{
                if(nowX<X){
                    nowX+=K;
                }else{
                    nowX-=K;
                }
            }
            System.out.println(nowX+" "+nowY);
        }
        if((Math.abs(nowY-Y)+Math.abs(nowX-X))==K){
            System.out.println(X+" "+Y);
            return;
        }
        if(nowX==X){
            int s=(Y+nowY)/2;
            int s1=Y-s;
            System.out.println((nowX+K-s1)+" "+s);
            System.out.println(X+" "+Y);
            return;
        }
        if(nowY==Y) {
            int s = (X + nowX) / 2;
            int s1 = X - s;
            System.out.println(s + " " + (nowY+K- s1));
            System.out.println(X + " " + Y);
            return;
        }
        int e=2*K-(Math.abs(nowY-Y)+Math.abs(nowX-X));
        K-=e/2;
        if(nowX>X){
            if(nowX-K>=X){
                nowX-=K;
            }else{
                if(nowY>Y){
                    nowY-=(K-(nowX-X));
                    nowX=X;
                }else{
                    nowY+=(K-(nowX-X));
                    nowX=X;

                }
            }
        }else{
            if(nowX+K<=X){
                nowX+=K;
            }else{
                if(nowY>Y){
                    nowY-=(K-(X-nowX));
                    nowX=X;
                }else{
                    nowY+=(K-(X-nowX));
                    nowX=X;
                }
            }
        }
        if(nowX==X){
            System.out.println((nowX-e/2) + " " + nowY);
        }else{
            if(nowY<Y){
                System.out.println(nowX + " " + (nowY-e/2));

            }else{
                System.out.println(nowX + " " + (nowY+e/2));
            }
        }
        System.out.println(X + " " + Y);






    }
    static int gcd (int a, int b) {
        int temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
