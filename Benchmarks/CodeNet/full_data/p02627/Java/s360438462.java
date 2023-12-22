public class main{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    char a = sc.nextLine();
    if (Character.isUpperCase(a)){
		System.out.println('A');
    }
    else{
      System.out.println('a');
    }
  }
}