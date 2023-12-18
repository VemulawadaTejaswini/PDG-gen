import java.util.*;

class Main{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    int[] a = new int[3];
    int[] b = new int[3];

    int iti = 0,ni=0,san=0,si =0;

    int odd=0, even=0;

    for(int i=0; i<3; i++){
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
    }

    for(int i=0; i<3; i++){
      if(a[i] == 1){
        iti++;
      }
      else if(a[i]==2)
      {
        ni++;
      }else if(a[i] == 3)
      {
        san++;
      }else if(a[i] == 4){
        si++;
      }

      if(b[i] == 1){
        iti++;
      }
      else if(b[i]==2)
      {
        ni++;
      }else if(b[i] == 3)
      {
        san++;
      }else if(b[i] == 4){
        si++;
      }
    }

    if(checkEven(iti)){
      even++;
    }else{
      odd++;
    }
    if(checkEven(ni)){
      even++;
    }else{
      odd++;
    }
    if(checkEven(san)){
      even++;
    }else{
      odd++;
    }

    if(checkEven(si)){
      even++;
    }else{
      odd++;
    }

      if(odd == 2 && even == 2)
      {
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }

  }

  public static boolean checkEven(int num){
    if(num %2 == 0){
      return true;
    }
    return false;
  }

}