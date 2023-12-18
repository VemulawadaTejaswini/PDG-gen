import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner obj=new Scanner(System.in);
       int N=obj.nextInt();
       int[][] arr=new int[N][2];
       for(int i=0;i<N;i++){
           arr[i][0]=obj.nextInt();
           arr[i][1]=obj.nextInt();
       }
       int A=0,B=0,total=0;
       long result=0;
       for(int i=0;i<N;i++){
           for(int j=i+1;j<N;j++){
               A=arr[i][0]+arr[j][0];
               B=arr[j][1]+arr[j][1];
               total=A+B;
               long T=factorial(total)%(long)(Math.pow(10,9)+7);
               long AB=(factorial(A)*factorial(B))%(long)(Math.pow(10,9)+7);
               result=result+(T/AB);            
           }
       }
        System.out.println(result);
       
    }
    public static long factorial(int a){
        long fact=1;
        for(int i=2;i<=a;i++)
               fact=(fact*i)%(long)(Math.pow(10,9)+7);
        return fact;
    }
}
