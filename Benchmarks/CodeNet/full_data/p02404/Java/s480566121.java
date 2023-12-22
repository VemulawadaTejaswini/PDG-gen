import java.util.Scanner;

public classMain {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int a,b,i,j;
    a=scan.nextInt();
    b=scan.nextInt();


      for (j=0;j<b ;j++ ) {
        System.out.print("#");
      }
      if (a==0&&b==0) {
        ;
      }else{
      System.out.println(" ");
      }
      for(i=0;i<a-2;i++){
      System.out.print("#");
      for(j=0;j<b-2;j++){
      System.out.print(".");
    }
    System.out.println("# ");
  }
for(j=0;j<b;j++){  System.out.print("#");
}if (a==0&&b==0) {
  ;
}else{
System.out.println(" ");
}
    }

}

