//Don't have to see. start------------------------------------------
var read = require('readline').createInterface({
  input: process.stdin, output: process.stdout
});
var obj; var inLine = [];
read.on('line', function(input){inLine.push(input);});
read.on('close', function(){
  obj = init(inLine);
  console.error('\n↑入力 ↓出力');
  Main();
});
function makeClone(obj){return (obj instanceof Set) ? new Set(Array.from(obj)) : JSON.parse(JSON.stringify(obj));}
function nextInt(){return myconv(next(),1);} function nextStrArray(){return myconv(next(),2);}
function nextIntArray(){return myconv(next(),4);} function nextCharArray(){return myconv(next(),6);}
function next(){return obj.next();} function hasNext(){return obj.hasNext();}
function init(input){  
  return {
    list : input, index : 0, max : input.length,
    hasNext : function(){return (this.index < this.max);},
    next : function(){if(this.hasNext()){return this.list[this.index++];}else{throw 'ArrayIndexOutOfBoundsException ‚There is no more input';}}
  };
}
function myout(s){console.log(s);}
function myerr(s){console.error('debug:' + require('util').inspect(s,false,null));}
//param "no" is
//unknown or outlier : return i. 1: parseInt.
//2: split space. 4: split space and parseInt.
//6: split 1 character. 7: split 1 character and parseInt.
//8: join space. 9: join nextline. 0: join no character.
function myconv(i,no){try{switch(no){case 1:return parseInt(i);case 2:return i.split(' ');case 4:return i.split(' ').map(Number);case 6:return i.split('');case 7:return i.split('').map(Number);case 8:return i.join(' ');case 9:return i.join('\n');case 0:return i.join('');default:return i;}}catch(e){return i;}}

//Don't have to see. end------------------------------------------
function Main(){
  var N = nextInt();
  var list = nextIntArray();
  var check = list[0];
  for(var i = 0; i < N; i++){
    check = gcd(check, list[i]);
  }
  if(check != 1){
    myout("not coprime");
    return;
  }
  var used = new Set();
  for(var i = 0; i < N; i++){
    if(isPrime(list.get(i))){
      if(used.has(keys[j])){
        myout("setwise coprime");
        return;
      }
      used.add(keys[j]);
      continue;
    }
    var map = getPrimeFactorization(list[i]);
    var keys = Object.keys(map);
    for(var j = 0; j < keys.length; j++){
      if(used.has(keys[j])){
        myout("setwise coprime");
        return;
      }
      used.add(keys[j]);
    }
  }
  myout("pairwise coprime");

}
function gcd(m, n) {return n != 0 ? gcd(n, m % n) : m;}
function isPrime(val){
  if(val == null || val <= 1 || (val != 2 && val % 2 == 0)){
    return false;
  }else if(val == 2){
    return true;
  }
  var root = Math.floor(Math.sqrt(val));
  for(var i = 3; i <= root; i += 2){
    if(val % i == 0){
      return false;
    }
  }
  return true;
}
function getPrimeFactorization(val){
  var primeMap = {};
  var div = 2;
  while(val != 1){
    if(val % div == 0){
      var count = 2;
      while(val % Math.pow(div, count) == 0){
         count++;
      }
      (primeMap[div] == null)  ? primeMap[div] = (count - 1) : primeMap[div] += (count - 1);
      val /= Math.pow(div, count - 1);
      if(isPrime(val)){
        (primeMap[val] == null)  ? primeMap[val] = 1 : primeMap[val]++;
        break;
      }
    }
    div = (div == 2) ? div + 1 : div + 2;
  }
  return primeMap;
}