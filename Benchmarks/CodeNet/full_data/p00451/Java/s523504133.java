//import java.io.File;
import java.util.Scanner;

import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

class Main{
  public static void main(String[] args) throws Exception {
    //Scanner scan = new Scanner(new File("in.txt"));
    Scanner scan = new Scanner(System.in);

/*
    System.out.println(s1);
    System.out.println(s2);
*/
    while(scan.hasNext()) {
      char[] s1 = scan.next().toCharArray();
      char[] s2 = scan.next().toCharArray();
      //same_letters,firstindex
      HashMap<String,HashSet<Integer>> dp = new HashMap<>();

      for(int i = 0; i < s1.length; i++) {
        String s = ""+s1[i];
        int length = 1;
        while(i+length<s1.length&&dp.containsKey(s + s1[i+length])) {
          s += s1[i+length];
          length++;
        }
        //dp????????¨????????¨???
        if(length>1) {
          //System.out.println(i+","+length+"   "+s);
          for(int _index : dp.get(s)) {
            for(int j = 1; _index+j+length-1<s2.length&&_index+j+i+length<s1.length&&s2[_index+length+j-1]==s1[_index+j+i+length]; j++) {
              s += s2[_index+j];
              HashSet<Integer> dummy = dp.get(s);
              if(dummy==null) dummy = new HashSet<>();
              dummy.add(_index);
              dp.put(s,dummy);
            }
          }
        }else {
        //???????????¨???
          for(int j = 0; j < s2.length; j++) {
            if(s1[i]==s2[j]) {
              s = ""+s2[j];
              int count = 1;
              while(count+i<s1.length&&count+j<s2.length&&s1[i+count]==s2[j+count]) {
                s += s2[j+count];
                //System.out.println(i+","+j+"        "+s);
                HashSet<Integer> dummy = dp.get(s);
                if(dummy==null) dummy = new HashSet<>();
                dummy.add(j);
                dp.put(s,dummy);
                count++;
              }
            }
          }
        }
      }

      int max = 0;
      for(Map.Entry<String,HashSet<Integer>> entry : dp.entrySet()) {
  /*
        System.out.print(entry.getKey()+":");
        for(int _i : entry.getValue()) {
          System.out.println(_i);
        }
  */
        int _l = entry.getKey().length();
        if(max < _l) max = _l;
      }
      System.out.println(max);
    }
  }
}