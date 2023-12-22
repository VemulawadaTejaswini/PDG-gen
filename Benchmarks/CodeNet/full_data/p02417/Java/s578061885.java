public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
			scan.useDelimiter("//n");
			char[] arr = new char[1200];
			String str2 ="abcdefghijklmnopqrstuvwxyz";
			char[] arr2 = str2.toCharArray();
			int[] line = new int[26];

			do{
				String str = scan.nextLine();
				arr = str.toCharArray();

				for(int i = 0;i <arr.length;i++){
					if(Character.isUpperCase(arr[i])){
						arr[i] = Character.toLowerCase(arr[i]);
					}
					for(int j = 0; j< 26;j++){
						if(arr[i] == arr2[j]){
							line[j]++;
						}
					}
				}
			}while(scan.hasNext());
		for(int i = 0;i < 26;i++){
			System.out.println(arr2[i] + " : " +line[i]);
		}
	}

}