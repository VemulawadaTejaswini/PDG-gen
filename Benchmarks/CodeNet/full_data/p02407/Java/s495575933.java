import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int[] rev;
rev = new int[n];


for(int i=0;i<n;i++){
rev[i]=sc.nextInt();
}
for(int i=0;i<n;i++){

if(i!=n-1){
System.out.printf("%d ",rev[n-1-i]);
}else{
    System.out.printf("%d\n",rev[n-1-i]);   
}
}

sc.close();
}

}
