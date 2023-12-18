function main(input) {
   input = input.trim();
  const a = input.split(" ").map(Number);
  console.log(Math.max(a[0]+a[1], Math.max(a[0]-a[1], a[0]*a[1])));
  
}
main(require('fs').readFileSync('/dev/stdin', 'utf8'));