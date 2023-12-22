import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
String[] a=new String[n];

int i=0;
for(i=0;i<n;i++){
    a[i]=scan.next();
}
Arrays.sort(a);

i=0;
int sum=0;
for(i=0;i<n-1;i++){
  if(a[i].equals(a[i+1])){
    sum=sum;
  }else{
    sum=sum+1;
  }
}
  

System.out.println(sum+1);


}
}