import java.util.*;

class Main{

	public static ArrayList<String> nameM = new ArrayList<>();
	public static ArrayList<String> nameA = new ArrayList<>();
	public static ArrayList<String> nameR = new ArrayList<>();
	public static ArrayList<String> nameC = new ArrayList<>();
	public static ArrayList<String> nameH = new ArrayList<>();
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();



		for(int n=0;n<N;n++){
			String st = sc.next();
			switch(st.charAt(0)){
				case 'M':
				 nameM.add(st);
				break;
				case 'A':
				 nameA.add(st);
				break;
				case 'R':
				 nameR.add(st);
				break;
				case 'C':
				 nameC.add(st);
				break;
				case 'H':
				 nameH.add(st);
				break;
				default:
				break;
			}
		}

		int ns[] = new int[5];
		ns[0] = nameM.size();
		ns[1] = nameA.size();
		ns[2] = nameR.size();
		ns[3] = nameC.size();
		ns[4] = nameH.size();

		long count = 0;
		count += ns[0]*ns[1]*ns[2];
		count += ns[0]*ns[1]*ns[3];
		count += ns[0]*ns[1]*ns[4];
		count += ns[0]*ns[2]*ns[3];
		count += ns[0]*ns[2]*ns[4];
		count += ns[0]*ns[3]*ns[4];
		count += ns[1]*ns[2]*ns[3];
		count += ns[1]*ns[2]*ns[4];
		count += ns[1]*ns[3]*ns[4];
		count += ns[2]*ns[3]*ns[4];

		System.out.println(count);

	}
}