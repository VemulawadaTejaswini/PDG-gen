import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int d=scan.nextInt();
int a=scan.nextInt();
int[] x=new int[n];
int[] h=new int[n];

int i=0;
for(i=0;i<n;i++){
    x[i]=scan.nextInt();
    h[i]=scan.nextInt();
    if(h[i]%a==0){
        h[i]=h[i]/a;
    }else{
        h[i]=h[i]/a+1;
    }
}

int j=0;
int sum=0;
int e=0;
for(i=0;i<n;i++){
    if(h[i]>0){
        sum=sum+h[i];
        e=h[i];
        exitloop:
            for(j=i;j<n;j++){
                if(x[i]+2*d>=x[j]){
                    h[j]=h[j]-e;            
                }else{
                    break exitloop;
                }
            }
    }
}

System.out.println(sum);
}
}