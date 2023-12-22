import java.util.Scanner;

public class Main{
    public static void main(final String[] args) {
 Scanner sc = new Scanner(System.in);
 
for(int k=0;;k++){

 int H=sc.nextInt();
 int W=sc.nextInt();
 if(H==0&&W==0){
break;
 }
 for(int i=0;i<H;i++){
for(int j=0;j<W;j++){
System.out.print("#");
 }
 System.out.println("");
}
System.out.println();
}

 sc.close();
    }
}
