import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int team_num =  scan.nextInt();
			if(team_num == 0) break;
			//String[][] s = new String[team_num][10];
			ArrayList[] list = new ArrayList[team_num];
			for(int i=0;i<team_num;i++){
				list[i] = new ArrayList();
				String[] gyou = new String[team_num];
				gyou[i] = scan.next();
				String new_gyou = gyou[i].substring(0,gyou[i].length()-1);
				//System.out.println(new_gyou);
				String[] name = new_gyou.split(":",0);
				list[i].add(name[0]);
				
				//for(int j=0;j<name.length;j++){
				//	System.out.println(name[j]);
				//}
				
				String[] person = name[1].split(",",0);
				for(int j=0;j<person.length;j++){
					list[i].add(person[j]);
					//System.out.println(person[j]);
				}
			}
			/*
			for(int i=1;i<team_num;i++){
				for(int j=1;j<list[0].size();j++){
					if(list[0].get(j).equals(list[i].get(0))){
						
						for(int k=1;k<list[i].size();k++){
							boolean flag = false;
							for(int l=1;l<list[0].size();l++){
								if(list[i].get(k).equals(list[0].get(l))){
									flag = true;
								}
							}
							if(flag = false) list[0].add(list[i].get(k));
						}
					}
				}
			}
			*/

			for(int i=1;i<list[0].size();i++){
				for(int j=1;j<team_num;j++){
					if(list[0].get(i).equals(list[j].get(0))){
						//list[0].remove(i);
						boolean memberFlag = false;
						for(int k=1;k<list[j].size();k++){
							for(int l=1;l<list[0].size();l++){
								if(list[j].get(k).equals(list[0].get(l))){
									memberFlag = true;
									break;
								}
							}
							if(memberFlag == false){
								list[0].add(list[j].get(k));
							}
							memberFlag = false;
						}
					}
				}
			}
			int count = 0;
			for(int i=0;i<team_num;i++){
				for(int j=0;j<list[0].size();j++){
					if(list[0].get(j).equals(list[i].get(0))){
						count++;
						break;
					}
				}
			}
			System.out.println(list[0].size()-count);
		}
	}
}