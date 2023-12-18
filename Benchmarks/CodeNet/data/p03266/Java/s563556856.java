import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		//int[] array_k = new int[100000];
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		if(k%2==1) {
			for(int i=1;n+1>i;i++) {
				if(i%k == 0) {
					list.add(i);
				}
			}
			for(int i=0;list.size()>i;i++) {
				if(list.get(i)%k == 0) {
					for(int j=0;list.size()>j;j++) {
						if(list.get(j)%k == 0) {
							for(int l =0;list.size()>l;l++) {
								if(list.get(l)%k == 0)
									count++;
							}
						}
					}
				}
			}
			//System.out.println(list);
			System.out.println(count);
		}
		else {
			for(int i=1;n+1>i;i++) {
				if(i%k == 0) {
					list.add(i);
				}
				if(i%k == k/2) {
					list.add(i);
				}
			}
			for(int i=0;list.size()>i;i++) {
				if(list.get(i)%k == 0) {
					for(int j=0;list.size()>j;j++) {
						if(list.get(j)%k == 0) {
							for(int l =0;list.size()>l;l++) {
								if(list.get(l)%k == 0)
									count++;
							}
						}
					}
				}
				if(list.get(i)%k == k/2) {
					for(int j=0;list.size()>j;j++) {
						if(list.get(j)%k == k/2) {
							for(int l =0;list.size()>l;l++) {
								if(list.get(l)%k == k/2)
									count++;
							}
						}
					}
				}
			}
			//System.out.println(list);
			System.out.println(count);
		}
	}
}