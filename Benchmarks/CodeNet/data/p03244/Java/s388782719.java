
import java.util.HashMap;
import java.util.Scanner;

 class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
//		HashSet<Integer> set = new HashSet<>();
		HashMap<Integer, Integer> map1 = new HashMap<>(),map2=new HashMap<>();
		int mx1 = 0, mx2 = 0;
		boolean chk =true;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if(i>0) {
				if(arr[i] !=arr[i-1])chk=false;
			}
			if(i%2==0) {
				if (map1.containsKey(arr[i]))
					map1.put(arr[i], map1.get(arr[i]) + 1);
				else
					map1.put(arr[i], 1);
			}
			if(i%2==1) {
				if (map2.containsKey(arr[i]))
					map2.put(arr[i], map2.get(arr[i]) + 1);
				else
					map2.put(arr[i], 1);
			}
			if (i % 2 == 0 && map1.get(arr[i]) > mx1)
				mx1 = map1.get(arr[i]);
			if(i%2==1 && map2.get(arr[i])>mx2)mx2=map2.get(arr[i]);

		}

//		System.out.println(mx+" "+mx2);
		if (chk)
			System.out.println(n / 2);
		else
			System.out.println(n - mx1 - mx2);
	}
}