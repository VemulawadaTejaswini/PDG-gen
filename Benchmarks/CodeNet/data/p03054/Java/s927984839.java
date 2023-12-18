import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        int N=sc.nextInt();
        int Sr=sc.nextInt()-1;
        int Sc=sc.nextInt()-1;
        char[] S=sc.next().toCharArray();
        char[] T=sc.next().toCharArray();

        int xs=0;
        int xe=W;
        int ys=0;
        int ye=H;
        for(int i=N-1;i>=0;i--){
            switch (T[i]){
                case 'D':
                    if(ys>0){
                        ys--;
                    }
                    break;
                case 'U':
                    if(ye<H){
                        ye++;
                    }
                    break;
                case 'R':
                    if(xs>0){
                        xs--;
                    }
                    break;
                case 'L':
                    if(xe<W){
                        xe++;
                    }
            }
            switch (S[i]){
                case 'D':
                        ye--;
                        if(ye==ys){
                            System.out.println("NO");
                            return;
                        }
                    break;
                case 'U':
                        ys++;
                    if(ye==ys){
                        System.out.println("NO");
                        return;
                    }
                    break;
                case 'R':
                        xe--;
                    if(xe==xs){
                        System.out.println("NO");
                        return;
                    }
                    break;
                case 'L':
                        xs++;
                    if(xe==xs){
                        System.out.println("NO");
                        return;
                    }
            }
        }
        if(xs<=Sc&&Sc<xe&&ys<=Sr&&Sr<ye){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
}
