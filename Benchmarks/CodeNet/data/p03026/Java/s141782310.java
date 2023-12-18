import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
        HashMap<Integer,Integer> d=new HashMap<>();
        int[] result=new int[N];
        int[] A=new int[N-1];
        int[] B=new int[N-1];
        for(int i=0;i<N;i++){
            d.put(i,0);
        }
        int[] c=new int[N];
        for(int i=0;i<N-1;i++){
            int a=in.nextInt()-1;
            A[i]=a;

            d.put(a,d.get(a)+1);
            a=in.nextInt()-1;
            B[i]=a;

            d.put(a,d.get(a)+1);
        }
        for(int i=0;i<N;i++){
            c[i]=in.nextInt();
        }
        List<Map.Entry<Integer, Integer>> list_entries = new ArrayList<Map.Entry<Integer, Integer>>(d.entrySet());

        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2){
                return obj1.getValue()-obj2.getValue();
            }
        });


        Arrays.sort(c);

        for(int i=0;i<N;i++) {
            result[list_entries.get(i).getKey()]=c[i];
        }
        int sum=0;
        for(int i=0;i<N-1;i++){
            sum+=Math.min(result[A[i]],result[B[i]]);
        }
        StringBuilder bu=new StringBuilder("");
        bu.append(sum);
        bu.append("\n");
        for(int i=0;i<N;i++) {
            bu.append(result[i]);
            bu.append(" ");
        }
        System.out.println(new String(bu));

    }
}
