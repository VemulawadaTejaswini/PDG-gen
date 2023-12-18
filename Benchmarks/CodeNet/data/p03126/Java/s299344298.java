function Main(input) {
	input = input.trim();
  var N = parseInt(input.split("\n")[0].split(" ")[0]);
  var M = parseInt(input.split("\n")[0].split(" ")[1]);
  var list = [];
  for(var i = 1; i <= N; i++){
    var tmp = input.split("\n")[i].split(" ");
    if(i == 1){
   	 for(var j = 1; j <= parseInt(tmp[0]); j++){
   	   list.push(tmp[j]);
   	 }
  	}else{
      tmp.shift();
      for(var j = 0; j < list.length; j++){
        if(tmp.indexOf(list[j]) == -1){
           list.splice(list.indexOf(list[j]),1);
          j--;
        }
      }
    }
  }
  console.log(list.length);
}

Main(require("fs").readFileSync("/dev/stdin", "utf8"));
