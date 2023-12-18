import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
    int[] hairetu = new int[S.length()+1];
    String[] words = new String[S.length()];
    for(int i = 0; i < S.length(); i++)
      words[i] = S.substring(i, i+1);

    for(int i = 0; i < hairetu.length; i++)
      hairetu[i] = -1;


    String before = words[0];
    if(before.equals("<"))
      hairetu[0] = 0;
    else
      hairetu[0] = 1;
    for(int i = 1; i < words.length; i++){
      if(before.equals("<")){
        if(words[i].equals("<")){
          hairetu[i] = hairetu[i-1]+1;
        }else{
          hairetu[i] = hairetu[i-1]+1;
        }

      }else{ //before ">"
        if(i > 2 && words[i-2].equals("<") && words[i].equals(">")){
          hairetu[i] = 1;
        }else if(hairetu[i] == -1 && words[i].equals(">")){
          hairetu[i] = hairetu[i-1]+1;
        }else if(hairetu[i] == -1 && words[i].equals("<")){
          hairetu[i] = 0;
        }

      }
      before = words[i];
    }

    if(words[words.length-1].equals(">")){
      hairetu[hairetu.length-1] = 0;
    }else{
      hairetu[hairetu.length-1] = hairetu[hairetu.length-2]+1;
    }

    int total = 0;
    for(int i = 0; i < hairetu.length; i ++)
      total += hairetu[i];


    System.out.println(total);
  }
}