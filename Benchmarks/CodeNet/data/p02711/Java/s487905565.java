input java.util.Scanner;
public static Main{
	public static vid main(String args[]){
    Scanner scn = new Scanner (System.in);
      int N = scn.nextint();
	scn.close();
      for(int i = 0;i<3;i++){
      if(N.charAt(i) == 7){
      System.out.println("Yes");
      }
    }
      System.out.println("No");
}