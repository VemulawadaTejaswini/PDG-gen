import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        int a=N/1000;
        int b=N/100%10;
        int c=N/10%10;
        int d=N%10;
        
        for(int x=1;x<=2;x++){
            for(int y=1;y<=2;y++){
                for(int z=1;z<=2;z++){
                    if(a+Math.pow(-1,x)*b+Math.pow(-1,y)*c+Math.pow(-1,z)*d==7){
                        String X,Y,Z;
                        if(x==1){
                            X="-";
                        }else{
                            X="+";
                        }
                        if(y==1){
                            Y="-";
                        }else{
                            Y="+";
                        }
                        if(z==1){
                            Z="-";
                        }else{
                            Z="+";
                        }
                        
                        System.out.println(a+X+b+Y+c+Z+d+"=7");
                    }
                    break;
                }
            }
        }
    }
}