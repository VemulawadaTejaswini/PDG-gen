import java.util.*;
import java.util.stream.Collectors;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        String[] s = sc.next().split("");
        List<Integer> r = new ArrayList<>();
        List<Integer> g = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
 
        for(int i=0;i<n;i++){
            if(s[i].equals("R"))r.add(i);
            if(s[i].equals("G"))g.add(i);
            if(s[i].equals("B"))b.add(i);
        }
 
        Integer sum = 0;
        sum += counter(r, g, b);
        sum += counter(r, b, g);
        sum += counter(g, r, b);
        sum += counter(g, b, r);
        sum += counter(b, g, r);
        sum += counter(b, r, g);
        System.out.println(sum);
    }

    private static Integer counter(List<Integer> a, List<Integer> b, List<Integer> c) {
        Integer sum = 0;
        for(Integer at : a){
            for(Integer bt : b.stream().filter(x -> x>at).collect(Collectors.toList())){
                Integer d = bt-at;
                if(d<0)continue;
                sum += (int)c.stream().filter(x -> (x-bt>0 && x-bt!=d)).count();
            }
        }
        return sum;
    }
}