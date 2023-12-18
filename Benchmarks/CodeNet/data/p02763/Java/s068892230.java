import java.util.*;

class Main{

    @SuppressWarnings("unchecked")
    Main(){
        Scanner SC = new Scanner(System.in);
        int N = Integer.parseInt(SC.next());
        String S = SC.next();

        TreeSet<Integer>[] alfabet = (TreeSet<Integer>[]) new TreeSet<?>[26];
        for(int i=0;i<26;i++){
            alfabet[i] = new TreeSet<Integer>();
        }

        for(int i=0;i<N;i++){
            alfabet[S.charAt(i)-'a'].add(i);
        }

        int Q = Integer.parseInt(SC.next());
        for(int i=0;i<Q;i++){
            if(SC.nextInt() == 1){
                int index = Integer.parseInt(SC.next()) - 1;
                int c     = SC.next().charAt(0) - 'a';
                int p     = S.charAt(index) - 'a';
                if(p != c){
                    alfabet[p].remove(new Integer(index));
                    alfabet[c].add(index);
                }
            } else {
                int left  = SC.nextInt()-1;
                int right = SC.nextInt()-1;
                int n = 0;
                for(int j=0;j<26;j++){
                    Integer h = alfabet[j].higher(left-1);
                    if(h != null && h <= right){
                        n++;
                    }
                }
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args){
        Main main = new Main();
    }
}
