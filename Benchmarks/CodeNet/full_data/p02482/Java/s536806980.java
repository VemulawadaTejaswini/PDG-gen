import java.util.Scanner;

public static void Main(String[] args){

  Scanner sc = new Scanner (System.in);
  int a= sc.nextInt();
  int b= sc.nextInt();
  if(a<b){
    System.out.printIn("a<b");
}else if(a>b){
    System.out.printIn("a>b");

}else{
    System.out.printIn("a=b");
}


}