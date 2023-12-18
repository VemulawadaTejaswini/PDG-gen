import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    char[] ch = new char[s.length()];
    char c;

    for(int i=0; i<s.length(); i++){
       c = s.charAt(i);

       for(int j=0; j<n; j++){

          if(c == 'Z'){
             c = 'A';
          }else{
             c++;
          }
   
       }
       ch[i] = c;
       System.out.print(String.valueOf(ch[i]));
    }
  }
}

