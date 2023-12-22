import java.util.Scanner;
import java.util.LinkedList;

class Main {
    public static void main(String[] args){
        LinkedList<Integer> s = new LinkedList<Integer>();
        LinkedList<Integer> h = new LinkedList<Integer>();
        LinkedList<Integer> c = new LinkedList<Integer>();
        LinkedList<Integer> d = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=13; i++){
            s.add(i);
            h.add(i);
            c.add(i);
            d.add(i);
        }
        for(int i=0; i<2*n; i++){
            if(sc.next().equals("S")){
                s.remove(s.indexOf(sc.nextInt()));
            }else if(sc.next().equals("H")){
                h.remove(h.indexOf(sc.nextInt()));
            }else if(sc.next().equals("C")){
                c.remove(c.indexOf(sc.nextInt()));
            }else{
                d.remove(d.indexOf(sc.nextInt()));
            }
        }
        for(int i=0; i<s.size(); i++){
            System.out.println("S " + s.get(i));
        }
        for(int i=0; i<h.size(); i++){
            System.out.println("H " + h.get(i));
        }
        for(int i=0; i<c.size(); i++){
            System.out.println("C " + c.get(i));
        }
        for(int i=0; i<d.size(); i++){
            System.out.println("D " + d.get(i));
        }
    }
}