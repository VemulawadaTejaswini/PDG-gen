import java.util.Scanner;

class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int w=sc.nextInt();
int n=sc.nextInt();
int[] k=new int[w];
int p,q,r;
for(int i=0;i<w;i++){
k[i]=i+1;
}

for(int l=0;l<w;l++){
System.out.println(k[l]);
}
}
}