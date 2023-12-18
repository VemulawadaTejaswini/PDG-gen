function main(input){
    var lines = input.replace('\n',' ');
    lines = lines.split(" ");
    var N = lines[0];
    var K = lines[1];
    lines.splice(0,2);

    var utu=[K];

    for(var i=0;i < K;i++){
    	utu[i]=0;
    }

    var max=0;
    var mem=0;
    for (var i=0;i<N ;i++ ) {
    	var k=i+1;
    	while(N-k>=0){
    		for (var u=i;u<k ;u++ ) {
    			mem+=Number(lines[u]);
    		}
    		k++;
    		if(utu[0]<mem){
    			utu[0]=mem;
    			utu=utu.sort(compareNumbers);
    		}
    		mem=0;
    	}
    }
    max=utu[0];
    for (var i=1;i<K;i++){
    	max&=utu[i];
    }
    console.log(max);
}

function compareNumbers(a, b) {
  return a - b;
}

main(require('fs').readFileSync('/dev/stdin', 'UTF-8'));