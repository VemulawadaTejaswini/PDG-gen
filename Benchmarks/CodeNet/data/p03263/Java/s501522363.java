import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt(),w=sc.nextInt(),n=0,a[][]=new int[h][w],t[][]=new int[h][w];
        for(int i=0;i<h;++i){
            for(int j=0;j<w;++j){
                a[i][j]=sc.nextInt();
                t[i][j]=a[i][j];
            }
        }
        sc.close();
        for(int i=0;i<h-1;++i){
            for(int j=0;j<w;++j){
                if(t[i][j]%2!=0){
                    --t[i][j];
                    ++t[i+1][j];
                    ++n;
                }
            }
        }
        for(int i=0;i<w-1;++i){
            if(t[h-1][i]%2!=0){
                --t[h-1][i];
                ++t[h-1][i+1];
                ++n;
            }
        }
        System.out.println(n);
        for(int i=0;i<h-1;++i){
            for(int j=0;j<w;++j){
                if(a[i][j]%2!=0){
                    --a[i][j];
                    ++a[i+1][j];
                    System.out.println((i+1)+" "+(j+1)+" "+(i+2)+" "+(j+1));
                }
            }
        }
        for(int i=0;i<w-1;++i){
            if(a[h-1][i]%2!=0){
                --a[h-1][i];
                ++a[h-1][i+1];
                System.out.println(h+" "+(i+1)+" "+h+" "+(i+2));
            }
        }
    }
}