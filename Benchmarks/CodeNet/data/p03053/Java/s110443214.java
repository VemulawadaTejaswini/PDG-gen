import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt();
        int w=scan.nextInt();
        char A[][] =new char[h][w];
        char B[][] =new char[h][w];
        String str = "";
        for(int i=0;i<h;i++){
            str=scan.next();
            for(int j=0;j<w;j++){
                A[i][j]=str.charAt(j);
            }
        }

        /*
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        */


        char c;
        boolean d=true;
        int ans=0;

        while(true){
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    B[i][j]=A[i][j];
                    if(A[i][j]=='.'){d=false;}
                }
            }
            if(d){break;}
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    c=A[i][j];
                    if(c=='#'){
                        if(!(j==0)){
                            B[i][j-1]='#';
                        }
                        if(!(j==w-1)){
                            B[i][j+1]='#';
                        }
                        if(!(i==0)){
                            B[i-1][j]='#';
                        }
                        if(!(i==h-1)){
                            B[i+1][j]='#';
                        }
                    }
                }
            }
            ans++;
            d=true;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    A[i][j]=B[i][j];
                    if(A[i][j]=='.'){d=false;}
                }
            }
            d=true;
        }
        
        /*for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }*/
        System.out.println(ans);


    }
}