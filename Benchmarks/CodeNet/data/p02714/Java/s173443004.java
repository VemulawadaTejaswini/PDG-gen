import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        String[] s = sc.next().split("");
        List<Integer> rl = new ArrayList<>();
        List<Integer> gl = new ArrayList<>();
        List<Integer> bl = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(s[i].equals("R"))rl.add(i);
            if(s[i].equals("G"))gl.add(i);
            if(s[i].equals("B"))bl.add(i);
        }

        Integer[] r = rl.toArray(new Integer[0]);
        Integer[] g = gl.toArray(new Integer[0]);
        Integer[] b = bl.toArray(new Integer[0]);
        Long sum = 0L;
        sum += counter(r, g, b);
        sum += counter(r, b, g);
        sum += counter(g, r, b);
        sum += counter(g, b, r);
        sum += counter(b, g, r);
        sum += counter(b, r, g);
        System.out.println(sum);
    }

    private static Long counter(Integer[] a, Integer[] b, Integer[] c) {
        Long sum = 0L;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                Integer bt = b[j];
                Integer d = bt-a[i];
                if(d<0)continue;
                sum += Arrays.asList(c).stream().filter(x -> (x-bt>0 && x-bt!=d)).count();
            }
        }
        return sum;
    }
}