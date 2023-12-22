import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> hitArray = new ArrayList<>(),
					  blowArray = new ArrayList<>();
		
		int hit = 0, blow = 0;
		int[] a = new int[4], b = new int[4];
		for(int x = 0; x < 2; x++) {
			for(int i = 0; i < 4; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < 4; i++) {
				b[i] = sc.nextInt();
			}
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					if(a[i] == b[j] && i == j)	hit++;
					else if(a[i] == b[j])	blow++;
				}
			}
			
			hitArray.add(hit);
			blowArray.add(blow);
			
			hit = 0;
			blow = 0;
		}
		
		for(int i = 0; i < hitArray.size(); i++) {
			System.out.println(hitArray.get(i) + " " + blowArray.get(i));
		}
	}
}