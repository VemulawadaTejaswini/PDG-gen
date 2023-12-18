List<Integer>list = new ArrayList<>();
Scanner sc = new Scanner();
for(int i = 0;i <6;i++){
  list.add(sc.nextInt());
}
sc.close();

boolean flg = false;
for(int j=0;j < list.size();j++){
	int a = list.get(j);
  for(int l=0;l < list.size()-1;l++){
    int b = list.get(l+1);
    if(a-b>15||b-a>15){
		flg = true;
    }
  }
}
if(flg){
  System.out.println(":()";
}else{
  System.out.println("Yay!");
}
