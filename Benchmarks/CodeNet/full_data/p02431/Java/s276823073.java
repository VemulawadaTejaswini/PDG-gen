import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vec = new Vector<>();
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            String str = sc.nextLine();
            switch(str.charAt(0)){
            case '0' : vec.add(Character.getNumericValue(str.charAt(2))); break;
            case '1' : System.out.println(vec.elementAt(Character.getNumericValue(str.charAt(2)))); break;
            case '2' : vec.remove(vec.size()-1); break;
            }
        }
    }
}
