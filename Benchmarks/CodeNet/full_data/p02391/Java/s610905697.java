'use strict';
(function(stdin) {
  var inputs = stdin.toString().trim().split('\n');
  var params = inputs[0].split(' ').map(Number);

  (function(a, b) {
    // ????????????????????????
    var math = 1
    var math = 2
    
    if (a < b){
      return ('a < b');
    }else if(a > b){
      return ('a > b');
    }else if(a == b){
      return ('a == b');
    }

  }(params[0], params[1]));

}(require('fs').readFileSync('/dev/stdin', 'utf8')));