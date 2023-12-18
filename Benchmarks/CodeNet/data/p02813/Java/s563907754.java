import java.util.*;
import java.util.stream.*;
class Main{
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
	C();
  }
  
  private static void B(){
    int n = Integer.parseInt(sc.nextLine());
    String str = sc.nextLine();
    int ans = 0;
    for (int i = 0; i < n - 2;i++){
      if (str.substring(i,i+3).equals("ABC")) ans++;
    }
    System.out.println(ans);
  }
  
  
  public static void C(){
    int n = sc.nextInt();
      //Integer.parseInt(sc.nextLine());
    List<Integer> fst = new ArrayList<>();
    List<Integer> snd = new ArrayList<>();
    int[] nums = new int[n];
    for (int i = 0; i < n; i++){
      nums[i] = i + 1;
      fst.add(sc.nextInt());
    }
    for (int i = 0; i < n; i++){
      snd.add(sc.nextInt());
    }
    
    int a = 0, b = 0;
    List<List<Integer>> facs = new ArrayList<>();
    facs = perms(nums);
    
    for(int i = 0; i < facs.size(); i++){
      if (a != 0 && b != 0) break;
      if (fst.equals(facs.get(i))) a = i;
      if (snd.equals(facs.get(i))) b = i;
    }
    
   System.out.println(Math.abs(a - b));
  }
  public static List<List<Integer>> perms(int[] nums) {
    List<Integer> numbers = Arrays.stream(nums).boxed().collect(Collectors.toList());
    List<Integer> arr = new ArrayList<>();
    List<List<Integer>> facs = new ArrayList<>();
    return helper(numbers,arr,facs);
    }
  
  
  
   public static List<List<Integer>> helper(List<Integer> nums, List<Integer> arr,List<List<Integer>> result){
        
        if (nums.size() == 0 && (! arr.isEmpty())) {

          List<Integer> edge = new ArrayList<>();
          for (int i = 0; i < arr.size(); i++){
            edge.add(arr.get(i)); 
          }
          result.add(edge);
        }
        
        for (int i = 0; i < nums.size(); i++){
          int target = nums.get(i).intValue();
          List<Integer> newNums = nums.stream().filter(x -> x != target).collect(Collectors.toList());
          arr.add(target);
          helper(newNums, arr, result);
          arr.remove(arr.size()-1);
        }
     
        return result;
    }
  
 
}