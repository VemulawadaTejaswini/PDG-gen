import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new ABC110().doIt();
	}
	class ABC110{
		void doIt(){
			String str1 = sc.next();
			String str2 = sc.next();
			System.out.println(check(str1,str2));
		}
		String check(String str1,String str2) {
			char ctr1[] = str1.toCharArray();
			char ctr2[] = str2.toCharArray();
			int length = str1.length();
			int alf[] = new int[128];
			int alf2[] = new int[128];
			int cnt1 = 1;
			int cnt2 = 1;
			for(int i = 0;i < length;i++) {
				if(alf[ctr1[i]] == 0) {
					alf[ctr1[i]] = cnt1;
					ctr1[i] = (char)cnt1;
					cnt1++;
				}else ctr1[i] = (char)alf[ctr1[i]];
				
				if(alf2[ctr2[i]] == 0) {
					alf2[ctr2[i]] = cnt2;
					ctr2[i] = (char)cnt2;
					cnt2++;
				}else ctr2[i] = (char)alf2[ctr2[i]];
				if(ctr1[i] != ctr2[i])return "No";
			}
			return "Yes";
		}
	}
}
