import java.util.Scanner;
public class Main{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
while(true){
    int a = sc.nextInt();
    if(a==0){
        break;
    }
    int sum=0;
    double avg,bun=0;
    int[] b;
    b = new int[a];
    for(int i=0;i<a;i++){
b[i]=sc.nextInt();
sum+=b[i];
    }
avg=(double)sum/a;
for(int j=0;j<a;j++){
    bun+=(double)(b[j]-avg)*(b[j]-avg);
}
System.out.println(Math.sqrt(bun/a));
}
    }
}
