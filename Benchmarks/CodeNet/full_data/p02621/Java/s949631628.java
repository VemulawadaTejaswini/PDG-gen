function main(input) {
  var a = parseInt(input)
	console.log(a + a * a + a * a * a)
};


main(require('fs').readFileSync('/dev/stdin', 'utf8').trim().split("\n"));
