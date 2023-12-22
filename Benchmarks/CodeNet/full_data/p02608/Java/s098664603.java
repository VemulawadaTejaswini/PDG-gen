import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int m=60000;
int[] f=new int[m];

int i=0;
for(i=0;i<m;i++){
    f[i]=0;
}
int x=0;
int y=0;
int z=0;
int sum=0;
for(x=1;x<100;x++){
    for(y=1;y<100;y++){
        for(z=1;z<100;z++){
            sum=x*x+y*y+z*z+x*y+y*z+z*x;
            f[sum]=f[sum]+1;
        }
    }
}

for(i=1;i<n+1;i++){
    System.out.println(f[i]);
}

}
}