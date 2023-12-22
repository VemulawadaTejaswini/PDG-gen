import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      
        List<Integer> m = new ArrayList<Integer>();
        List<Integer> f = new ArrayList<Integer>();
        List<Integer> r = new ArrayList<Integer>();
        List<Character> ranks = new ArrayList<Character>();
         
        for (;;) {
            int _m = scan.nextInt();
            int _f = scan.nextInt();
            int _r = scan.nextInt();
             
            if (_m == -1 && _f == -1 && _r == -1) {
                break;
            }
             
            m.add(_m);
            f.add(_f);
            r.add(_r);
        }
 
        for (int i = 0; i < m.size(); i++) {
            char rank;
            int _m = m.get(i);
            int _f = f.get(i);
            int _r = r.get(i);
             
            if (_m == -1 || _f == -1) 
                rank = 'F';
            else if (_m + _f >= 80) 
                rank = 'A';
            else if (_m + _f >= 65) 
                rank = 'B';
            else if (_m + _f >= 50) 
                rank = 'C';
            else if (_m + _f >= 30) 
                if (_r >= 50)
                    rank = 'C';
                else
                    rank = 'D';
            else
                rank = 'F';
             
            ranks.add(rank);
        }
 
        for (Character character : ranks) {
            System.out.println(character);
        }
         
        scan.close();
    }
 
}