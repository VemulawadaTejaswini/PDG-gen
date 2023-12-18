import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			ArrayList<Integer> ws = new ArrayList<Integer>();
			List<Integer>[] vs = new ArrayList[4];
			for(int i=0;i<4;i++) {
				vs[i] = new ArrayList<Integer>();
			}
			
			for(int i=0;i<n;i++) {
				int ww = sc.nextInt();
				int vv = sc.nextInt();
				int id = ws.indexOf(ww);
				if(id == -1) {
					vs[ws.size()].add(vv);
					ws.add(ww);
				} else {
					vs[id].add(vv);
				}
			}
			
			for(int i=0;i<4;i++) {
				Collections.sort(vs[i]);
			}
			
			long max = 0;
			for(int a=0;a<=vs[0].size();a++) {
				if(vs[1].size()==0) {
					long nSum = ws.get(0) * a;
					if(nSum > w) {
						break;
					}
					
					long vSum = 0;
					for(int i=0;i<a;i++) {
						vSum += vs[0].get(vs[0].size()-1-i);
					}
					
					max = Math.max(max, vSum);
				} else {
					for(int b=0;b<=vs[1].size();b++) {
						if(vs[2].size()==0) {
							long nSum = ws.get(0) * a + ws.get(1) * b;
							if(nSum > w) {
								break;
							}
							
							long vSum = 0;
							for(int i=0;i<a;i++) {
								vSum += vs[0].get(vs[0].size()-1-i);
							}
							for(int i=0;i<b;i++) {
								vSum += vs[1].get(vs[1].size()-1-i);
							}
							
							max = Math.max(max, vSum);
						} else {
							for(int c=0;c<=vs[2].size();c++) {
								if(vs[3].size()==0) {
									long nSum = ws.get(0) * a + ws.get(1) * b + ws.get(2) * c;
									if(nSum > w) {
										break;
									}
									
									long vSum = 0;
									for(int i=0;i<a;i++) {
										vSum += vs[0].get(vs[0].size()-1-i);
									}
									for(int i=0;i<b;i++) {
										vSum += vs[1].get(vs[1].size()-1-i);
									}
									for(int i=0;i<c;i++) {
										vSum += vs[2].get(vs[2].size()-1-i);
									}
									
									max = Math.max(max, vSum);
								} else {
									for(int d=0;d<=vs[3].size();d++) {
										long nSum = ws.get(0) * a + ws.get(1) * b + ws.get(2) * c + ws.get(3) * d;
										if(nSum > w) {
											break;
										}
										
										long vSum = 0;
										for(int i=0;i<a;i++) {
											vSum += vs[0].get(vs[0].size()-1-i);
										}
										for(int i=0;i<b;i++) {
											vSum += vs[1].get(vs[1].size()-1-i);
										}
										for(int i=0;i<c;i++) {
											vSum += vs[2].get(vs[2].size()-1-i);
										}
										for(int i=0;i<d;i++) {
											vSum += vs[3].get(vs[3].size()-1-i);
										}
										
										max = Math.max(max, vSum);
									}
								}
							}
						}
					}
				}
			}
			
			System.out.println(max);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}
