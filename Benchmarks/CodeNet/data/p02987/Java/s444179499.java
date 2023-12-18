class FiftyFity{
 
  public boolean check(String S){
  if(S==null||S.length()!=4){
    return false;
  }
  
  Map<Character,Integer> map=new HashMap();
  for(char c:S.toCharArray()){
  	map.put(c,map.getOrDefault(c,0)+1);
  }
  
  return map.size()==2; 
}

  
}