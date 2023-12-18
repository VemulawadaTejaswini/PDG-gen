
import java.util.Scanner;
import java.util.Stack;

 class Main {

    static class Elem{
        int val;
        int index;

        public Elem(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();

        Elem[] elems = new Elem[n];
        for(int i=0;i<n;i++){
            elems[i]=new Elem(a[i],i);
        }
        Stack<Elem> s = new Stack<>();

        int color=0;
        s.add(elems[0]);
        for(int i=1;i<n;){

            Elem top = s.peek();
           // System.out.println("Top is: " + top.val+ " " + top.index);
            if(top.index < elems[i].index && top.val < elems[i].val){
                while(i< n && top.index < elems[i].index && top.val < elems[i].val){
                    Elem temp = s.pop();
                   // System.out.println("Popped: " + temp.val+ " " + temp.index);
                    //System.out.println("pushing " + elems[i].val+ " " + elems[i].index);
                    s.push(elems[i]);
                    top=s.peek();
                    i++;
                }
                color++;
                s.pop();
                //System.out.println("i= " + i);
            }
            else{
                //System.out.println("pushing " + elems[i].val+ " " + elems[i].index);
                s.push(elems[i]);
                i++;
            }
        }
        color+=s.size();
        System.out.println(color);

    }
}
