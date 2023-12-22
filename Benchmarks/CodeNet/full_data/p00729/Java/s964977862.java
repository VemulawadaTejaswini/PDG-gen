import java.io.*;
import java.util.*;
public class Main {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		int numPC = 0;//PCテ」ツ?ョテ・ツ?凝ヲツ閉ー
		int numST = 0;//テァツ板淌・ツセツ津ヲツ閉ー
		int R = 0;//テ・ツ按ゥテァツ板ィテヲツ卍づゥツ鳴禿・ツ?凝ヲツ閉ー
		int Q = 0;//ティツウツェテ・ツ閉湘ヲツ閉ー
		boolean inputend = false;
		class Student{
			int logintime[] = new int[1000];
			int logouttime[] = new int[1000];
			int PCID[] = new int[1000];
			int Data = 0;//テ」ツδ?」ツδシテ」ツつソテヲツ閉ー
			ArrayList<Integer> usestarttime = new ArrayList<Integer>(0);
			ArrayList<Integer> useendtime = new ArrayList<Integer>(0);
			
		}
		int Answers[] = new int[500];
		int Answernum = 0;
		Student stu[] = new Student[10000];
		int QuestionTs[] = new int[50];
		int QuestionTe[] = new int[50];
		int QuestionID[] = new int[50];
		public static void main(String []args){
			Main r = new Main();
			r.Run();
		}
		public void Run(){			
			try{
				while(true){
					for(int z = 0;z < stu.length;z++){
						stu[z] = new Student();
					}
					input = buff.readLine();
					String get[] = input.split(" ");
					numPC = Integer.parseInt(get[0]);
					numST = Integer.parseInt(get[1]);
					if(numPC == 0 && numST == 0){
						break;
					}
					input = buff.readLine();
					R = Integer.parseInt(input);
					int no;
					for(int z = 0;z < R;z++){
						input = buff.readLine();
						get = input.split(" ");
						no = Integer.parseInt(get[2]);
						if(Integer.parseInt(get[3]) == 1){
							stu[no].logintime[stu[no].Data] = Integer.parseInt(get[0]);
						}if(Integer.parseInt(get[3]) == 0){
							stu[no].logouttime[stu[no].Data] = Integer.parseInt(get[0]);
						}
						stu[no].PCID[stu[no].Data] = Integer.parseInt(get[1]);
						stu[no].Data++;
					}
					input = buff.readLine();
					Q = Integer.parseInt(input);
					for(int z = 0;z < Q;z++){
						input = buff.readLine();
						get = input.split(" ");
						QuestionTs[z] = Integer.parseInt(get[0]);
						QuestionTe[z] = Integer.parseInt(get[1]);
						QuestionID[z] = Integer.parseInt(get[2]);
						Answered(QuestionTs[z],QuestionTe[z],QuestionID[z],Answernum);
						Answernum++;
					}
					
				}
				for(int z = 0;z < Answernum; z++){
					System.out.println(Answers[z]);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	public void Answered(int QuestionTs,int QuestionTe,int QuestionID,int resultno){
		int usetime = 0;
		int numuse = 0;
		for(int time = 0;time < QuestionTe;time++){
			for(int z = 0;z < stu[QuestionID].Data;z++){
				if(stu[QuestionID].logintime[z] == time){
					numuse++;
				}if(stu[QuestionID].logouttime[z] == time){
					numuse--;
				}
			}
			if(numuse > 0 && time >= QuestionTs){
				usetime++;
			}
		}
		Answers[resultno] = usetime;
	}
}