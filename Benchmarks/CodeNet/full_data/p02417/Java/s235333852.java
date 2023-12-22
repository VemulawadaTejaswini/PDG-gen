import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        while(scan.hasNext()) {
            n = n + scan.nextLine();
        }
            System.out.println("a : " + counter('a', n));
            System.out.println("b : " + counter('b', n));
            System.out.println("c : " + counter('c', n));
            System.out.println("d : " + counter('d', n));
            System.out.println("e : " + counter('e', n));
            System.out.println("f : " + counter('f', n));
            System.out.println("g : " + counter('g', n));
            System.out.println("h : " + counter('h', n));
            System.out.println("i : " + counter('i', n));
            System.out.println("j : " + counter('j', n));
            System.out.println("k : " + counter('k', n));
            System.out.println("l : " + counter('l', n));
            System.out.println("m : " + counter('m', n));
            System.out.println("n : " + counter('n', n));
            System.out.println("o : " + counter('o', n));
            System.out.println("p : " + counter('p', n));
            System.out.println("q : " + counter('q', n));
            System.out.println("r : " + counter('r', n));
            System.out.println("s : " + counter('s', n));
            System.out.println("t : " + counter('t', n));
            System.out.println("u : " + counter('u', n));
            System.out.println("v : " + counter('v', n));
            System.out.println("w : " + counter('w', n));
            System.out.println("x : " + counter('x', n));
            System.out.println("y : " + counter('y', n));
            System.out.println("z : " + counter('z', n));
    }
    public static int counter(char c, String line){
        int sum = 0;
        for(int x = 0; x < line.length();x++){
            if(c == line.charAt(x)){
                sum++;
            }
            else if(Character.toUpperCase(c) == line.charAt(x)){
                sum++;
            }
        }
        return sum;
    }
}
