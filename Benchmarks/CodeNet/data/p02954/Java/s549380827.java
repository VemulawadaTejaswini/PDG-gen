import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        List<Integer> list = new ArrayList<Integer>();
        for(int k = 0; k< s.length();k++) {
          list.add(0);
        }
        boolean inR = true;
        int hotR = -1;
        int hotL = -1;
        int leftRange = 0;
        for(int k = 0; k < s.length();k++) {
          char cha = s.charAt(k);
          if(inR){
            if(cha == 'L') {
              inR = false;
              hotL = k;
              hotR = k-1;
            }
          } else {
            if(cha == 'R') {
              resolve(list,hotR,hotL,leftRange,k-1);
               leftRange=k;
               inR=true;
            }
          }
        }
        resolve(list,hotL,hotR,leftRange,s.length()-1);
        String str = list.stream().map(i->i.toString()).collect(Collectors.joining(" "));
        System.out.println(str);
    }
    
    private static void resolve(List<Integer> list, int hotL,int hotR, int leftRange, int rightRange) {

      int value = (rightRange-leftRange+1)/2;
      if((rightRange-leftRange+1)%2==0) {
        
        list.set(hotL, value);
        list.set(hotR, value);
      } else {
        if((hotR-leftRange) %2 ==0) {
          
          list.set(hotL, value);
          list.set(hotR, value+1);

        } else {
          list.set(hotL, value+1);
          list.set(hotR, value);
        }
        
      }
    }
}