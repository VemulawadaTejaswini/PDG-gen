import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    TreeSet<Integer> set = new TreeSet<Integer>();
    for(int i=0;i<n;i++){
      int a = sc.nextInt();
      arr1.add(a);
      set.add(a);
    }
    Iterator<Integer> itr =set.iterator();
    while(itr.hasNext()){
      arr.add(itr.next());
    }
    for(int i=0;i<n;i++){
      if(arr1.get(i)==arr.get(arr.size()-1)){
        System.out.println(arr.get(arr.size()-2));
                           }
      else{
        System.out.println(arr.get(arr.size()-1));
                            }
                            }
                            
                            }
                            }