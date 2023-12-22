import java.util.*;

class Main{
	static int id;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < n ; i++){
			id = 0;
			String[] list = split(sc.nextLine());
			System.out.println(calc(list));
		}
		sc.close();
	}
	static int calc(String[] list){
		int value = Integer.parseInt(list[id]);
		while(id < list.length-1){
			id++;
			if(list[id].equals("*")){
				if(list[id+1].equals("(")){
					id += 2;
					value *= calc(list);
				}else{
					value *= Integer.parseInt(list[++id]);
				}
			}else if(list[id].equals("/")){
				if(list[id+1].equals("(")){
					id += 2;
					value /= calc(list);
				}else{
					value /= Integer.parseInt(list[++id]);
				}
			}else if(list[id].equals("+")){
				id++;
				if(list[id].equals("(")){
					id++;
				}
				value += calc(list);
			}else if(list[id].equals("-")){
				id++;
				if(list[id].equals("(")){
					id++;
				}
				value -= calc(list);
			}else if(list[id].equals(")")){
				return value;
			}
		}
		return value;
	}
	static String[] split(String s){
		ArrayList<String> list = new ArrayList<String>();
		String tmp = "";
		int length = s.length();
		for(int i = 0; i < length; i++){
			if(!isInt(s.charAt(i))){
				if(!tmp.equals("")){
					list.add(tmp);
				}
				list.add(String.valueOf(s.charAt(i)));
				tmp = "";
			}else{
				tmp += s.charAt(i);
			}
		}
		String[] array = null;
		return (String[])list.toArray(new String[list.size()]);
	}
	static boolean isInt(char c){
		if('0' <= c && c <= '9'){
			return true;
		}else{
			return false;
		}
	}
}