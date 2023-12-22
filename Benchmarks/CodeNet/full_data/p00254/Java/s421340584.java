import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] poi = new int[4];
		int[] lol = new int[114514];
		int Desc,Asc,kazu,a,b,c,exit;
		int count =0;
		int place=0;
		kazu = sc.nextInt();
		while(kazu != 0000){
			count =0;
			poi[0] = kazu/1000;
			poi[1] = (kazu - poi[0]*1000)/100;
			poi[2] = (kazu - poi[0]*1000-poi[1]*100)/10;
			poi[3] = kazu - poi[0]*1000-poi[1]*100-poi[2]*10;
			if(poi[0]==poi[1]&&poi[1]==poi[2]&&poi[2]==poi[3]&&poi[3]==poi[0]){
				lol[place] = 9999;
				place++;
			}else{
				int hantei = kazu;
				while(hantei!=6174){
					count++;
					for(a=3;a>=0;a--){                          
						for(b=0;b<a;b++){
							if(poi[b+1]>poi[b]){
								exit = poi[b+1];
								poi[b+1] = poi[b];
								poi[b] = exit;
							}
						}
					}
					Desc = poi[0]*1000+poi[1]*100+poi[2]*10+poi[3];
						for(a=3;a>=0;a--){                         							for(b=0;b<a;b++){
								if(poi[b+1]<poi[b]){
									exit = poi[b+1];
									poi[b+1] = poi[b];
									poi[b] = exit;
								}
							}
						}
					Asc = poi[0]*1000+poi[1]*100+poi[2]*10+poi[3];
					hantei = Desc - Asc;
					poi[0] = hantei/1000;
					poi[1] = (hantei - poi[0]*1000)/100;
					poi[2] = (hantei - poi[0]*1000-poi[1]*100)/10;
					poi[3] = hantei - poi[0]*1000-poi[1]*100-poi[2]*10;
				}
				lol[place] = count;
				place++;
			}
			kazu= sc.nextInt();
		}
		lol[place] = 114514;
		for(c=0;lol[c]!=114514;c++){
			if(lol[c]==9999){
				System.out.println("NA");
			}else{
				System.out.println(lol[c]);
			}
		}
	}
}