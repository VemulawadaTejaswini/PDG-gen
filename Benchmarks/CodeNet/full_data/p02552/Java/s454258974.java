import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

      	int length = sc.nextInt();
      	int nums[] = new int[length];
      	int nums2[] = new int[length];
      	for( int i = 0; i < length; i++ ) {
			nums[i] = sc.nextInt();
        }
      	for( int i = 0; i < length; i++ ) {
			nums2[i] = sc.nextInt();
		}
		
		int res[] = new int[length];

      	Map<Integer,Integer> map = new HashMap<>();
		Map<Integer,Integer> map2 = new HashMap<>();

		for( int i = 0; i < length; i++ ) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		for( int i = 0; i < length; i++ ) {
			if(map2.containsKey(nums2[i])) {
				map2.put(nums2[i], map.get(nums2[i]) + 1);
			} else {
				map2.put(nums2[i], 1);
			}
		}

		for( int i = 0; i < length; i++ ) {
			
		}

		sc.close();
      	System.out.println("1");
	}
}