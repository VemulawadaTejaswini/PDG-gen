import java.util.Scanner;
public  class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[26];
    String str = sc.next();
    char[] ch = str.toCharArray();
    for(int i = 0; i < ch.length; i++){
      a[ch[i]-'a']++; 
    }
    for(int i = 0; i < a.length; i++){
      if(a[i] == 0){
    	  char ans = (char) (i + 'a');
        System.out.println(ans);
        return;
      }
    }
    System.out.println("None");
  }
}